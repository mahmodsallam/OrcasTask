package com.mahmoudsallam.myapplication.teams.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mahmoudsallam.myapplication.R;
import com.mahmoudsallam.myapplication.teams.data.local.TeamEntity;
import com.mahmoudsallam.myapplication.teams.data.model.Teams;

import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.AlbumsViewHolder> {

    List<Teams> teamsList;
    Context context;
    TeamsInterface teamsInterface;


    public TeamsAdapter(List<Teams> teamsList, Context context, TeamsInterface teamsInterface) {
        this.teamsList = teamsList;
        this.context = context;
        this.teamsInterface = teamsInterface;

    }

    @NonNull
    @Override
    public AlbumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.team_row,
                parent, false);
        return new AlbumsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AlbumsViewHolder holder, int position) {
        final Teams team = teamsList.get(position);
        holder.teamName.setText(team.getName());
        holder.teamWebsite.setText(team.getWebsite());
        holder.teamWebsite.setTextColor(Color.BLUE);
        holder.teamWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamsInterface.openTeamWebsite(team.getWebsite());
            }
        });

        holder.clubColor.setText(team.getClubColors());
        holder.teamVenue.setText(team.getVenue());
        holder.teamPlayer.setText(team.getTla());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = team.getId().toString();
                teamsInterface.openTeamDetails(id);
            }
        });

        holder.saveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TeamEntity teamEntity = new TeamEntity(team.getId(), team.getWebsite(),
                        team.getClubColors(), team.getVenue(), team.getTla());

                if (holder.saveImage.getDrawable().getConstantState() == context.getResources().
                        getDrawable(R.drawable.ic_book).getConstantState())
                {
                    holder.saveImage.setImageResource(R.drawable.ic_book_mark);
                    teamsInterface.saveTeamLocally(teamEntity);
                }

                else if (holder.saveImage.getDrawable().getConstantState() == context.getResources().
                        getDrawable(R.drawable.ic_book_mark).getConstantState()) {
                    holder.saveImage.setImageResource(R.drawable.ic_book);
                    teamsInterface.deleteTeamLocally(teamEntity);

                }


            }
        });
    }

    @Override
    public int getItemCount() {
        return teamsList.size();
    }

    class AlbumsViewHolder extends RecyclerView.ViewHolder {
        TextView teamName, teamWebsite, clubColor, teamVenue, teamPlayer;
        ImageView saveImage;

        public AlbumsViewHolder(@NonNull View itemView) {
            super(itemView);
            teamName = itemView.findViewById(R.id.teamName);
            teamWebsite = itemView.findViewById(R.id.teamWebsite);
            clubColor = itemView.findViewById(R.id.clubColor);
            teamVenue = itemView.findViewById(R.id.teamVenue);
            teamPlayer = itemView.findViewById(R.id.teamPlayer);
            saveImage = itemView.findViewById(R.id.saveImage);
        }
    }
}
