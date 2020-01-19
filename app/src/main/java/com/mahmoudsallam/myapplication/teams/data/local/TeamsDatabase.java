package com.mahmoudsallam.myapplication.teams.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {TeamEntity.class}, version = 2)
public abstract class TeamsDatabase extends RoomDatabase {
    public abstract TeamDao teamDao();
}




