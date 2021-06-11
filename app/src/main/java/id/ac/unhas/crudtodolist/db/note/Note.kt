package id.ac.unhas.crudtodolist.db.note

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note")
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int? = null,

    @ColumnInfo(name = "buat_waktu")
    var buatWaktu: Int? = null,

    @ColumnInfo(name = "str_buat_waktu")
    var strBuatWaktu: String? = null,

    @ColumnInfo(name = "update_waktu")
    var updateWaktu: Int? = null,

    @ColumnInfo(name = "tenggat_waktu")
    var tenggatWaktu: Int? = null,

    @ColumnInfo(name = "str_tenggat_waktu")
    var strTenggatWaktu: String? = null,

    @ColumnInfo(name = "tenggat_jam")
    var tenggatJam: Int? = null,

    @ColumnInfo(name = "str_tenggat_jam")
    var strTenggatJam: String? = null,

    @ColumnInfo(name = "judul")
    var judul: String,

    @ColumnInfo(name = "note")
    var note: String,

    @ColumnInfo(name = "selesai")
    var isFinished: Boolean? = null

)  : Parcelable