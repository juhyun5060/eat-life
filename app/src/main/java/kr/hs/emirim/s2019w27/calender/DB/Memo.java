package kr.hs.emirim.s2019w27.calender.DB;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
public class Memo {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String date;
    private int category;
    private String title;
    private String memo;
    //private String img;

    public Memo(String date, int category, String title, String memo) {
        this.date = date;
        this.category = category;
        this.title = title;
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

}
