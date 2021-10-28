package com.demo.glassignment.ui.details;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.demo.glassignment.R;
import com.demo.glassignment.data.DataManager;
import com.demo.glassignment.data.model.details.Move;
import com.demo.glassignment.data.model.details.PokemonDetails;
import com.demo.glassignment.data.repository.Repository;
import com.demo.glassignment.ui.adapter.MovesAdapter;
import com.demo.glassignment.ui.base.BaseActivity;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends BaseActivity<DetailsViewModel> {

    private ImageView mFront;
    private ImageView mBack;

    private TextView mTitle;
    private TextView mDetails;
    private TextView mStat;
    private TextView mMoveTxt;
    private TextView mRefresh;
    private RecyclerView mRecyclerView;
    private MovesAdapter mMovesAdapter;
    private List<Move> mMove = new ArrayList<>();


    @NonNull
    @NotNull
    @Override
    protected DetailsViewModel createViewModel() {
        Repository repository = DataManager.getInstance().getPokeRepository();
        DetailsViewModelFactory factory = new DetailsViewModelFactory(repository);
        return ViewModelProviders.of(this, factory).get(DetailsViewModel.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);
        initViews();
        observeViewModel();
        mViewModel.getPokeDetails();
    }

    private void initViews() {
        mFront = findViewById(R.id.imgFront);
        mBack = findViewById(R.id.imgBack);
        mTitle = findViewById(R.id.txtTitle);
        mRefresh = findViewById(R.id.refresh);
        mDetails = findViewById(R.id.txtDetails);
        mStat = findViewById(R.id.txtStat);
        mMoveTxt = findViewById(R.id.txtMoves);
        mRecyclerView = findViewById(R.id.recyclerView);
        mMovesAdapter = new MovesAdapter(mMove);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mMovesAdapter);


        mRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getPokeDetails();
            }
        });
    }

    private void observeViewModel() {
        mViewModel.getShowLoadingLiveData().observe(this, new Observer<Void>() {
            @Override
            public void onChanged(@Nullable Void aVoid) {
                progressdialog.show();
            }
        });

        mViewModel.getHideLoadingLiveData().observe(this, new Observer<Void>() {
            @Override
            public void onChanged(@Nullable Void aVoid) {
                progressdialog.cancel();
            }
        });

        mViewModel.getShowErrorMessageLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String message) {
                // Snackbar.make(binding.navView, message, BaseTransientBottomBar.LENGTH_SHORT).show();
            }
        });
        mViewModel.getPokeLiveData().observe(this, new Observer<PokemonDetails>() {
            @Override
            public void onChanged(PokemonDetails pokemonDetails) {
                updateData(pokemonDetails);
            }
        });
    }

    private void updateData(PokemonDetails pokemonDetails) {
        Glide.with(DetailsActivity.this).load(pokemonDetails.getSprites().getFrontDefault()).into(mFront);
        Glide.with(DetailsActivity.this).load(pokemonDetails.getSprites().getBackDefault()).into(mBack);
        mTitle.setText(pokemonDetails.getName());

        BarChart barChart = (BarChart) findViewById(R.id.chart);


        if (pokemonDetails.getStats() != null) {
            barChart.setVisibility(View.VISIBLE);
            mStat.setVisibility(View.VISIBLE);
            ArrayList<BarEntry> entries = new ArrayList<>();
            ArrayList<String> labels = new ArrayList<String>();
            for (int i = 0; i < pokemonDetails.getStats().size(); i++) {
                entries.add(new BarEntry(pokemonDetails.getStats().get(i).getBaseStat(), i));
                labels.add(pokemonDetails.getStats().get(i).getStat().getName());
            }
            BarDataSet bardataset = new BarDataSet(entries, "");
            BarData data = new BarData(labels, bardataset);
            barChart.setData(data); // set the data and list of labels into chart
            barChart.setDescription("");  // set the description
            bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
            barChart.animateY(2000);
        } else {
            barChart.setVisibility(View.GONE);
            mStat.setVisibility(View.GONE);
        }

        if (pokemonDetails.getMoves() != null && pokemonDetails.getMoves().size() > 0) {
            mMoveTxt.setVisibility(View.VISIBLE);
            mRecyclerView.setVisibility(View.VISIBLE);
            mMove.clear();
            mMove.addAll(pokemonDetails.getMoves());
            mMovesAdapter.notifyDataSetChanged();
        } else {
            mMoveTxt.setVisibility(View.GONE);
            mRecyclerView.setVisibility(View.GONE);
        }

    }
}