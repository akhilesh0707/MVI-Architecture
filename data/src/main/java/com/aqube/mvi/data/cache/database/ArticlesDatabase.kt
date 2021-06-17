package com.aqube.mvi.data.cache.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aqube.mvi.data.cache.Migrations
import com.aqube.mvi.data.cache.dao.ArticlesDao
import com.aqube.mvi.data.cache.models.ArticleEntity
import javax.inject.Inject
import javax.xml.transform.Source

@Database(
    entities = [ArticleEntity::class, Source::class],
    version = Migrations.DB_VERSION,
    exportSchema = false
)
abstract class ArticlesDatabase @Inject constructor() : RoomDatabase() {
    abstract fun cachedArticlesDao(): ArticlesDao
}