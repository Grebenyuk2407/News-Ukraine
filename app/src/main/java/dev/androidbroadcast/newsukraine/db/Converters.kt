package dev.androidbroadcast.newsukraine.db

import androidx.room.TypeConverter
import dev.androidbroadcast.newsukraine.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}