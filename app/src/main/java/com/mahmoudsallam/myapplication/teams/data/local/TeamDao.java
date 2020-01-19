package com.mahmoudsallam.myapplication.teams.data.local;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import io.reactivex.Observable;

@Dao
public interface TeamDao {
    @Query("Select * from Team ")
    Observable<TeamEntity> getTeamsLocally();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(TeamEntity entity);

    @Delete
    void delete(TeamEntity entity);
}
