package ir.mahmoud.mvptest.Other.Objects;

import com.orm.SugarRecord;

/**
 * Created by soheilsystem on 2/22/2018.
 */

public class ObjectNote extends SugarRecord{

    public String content;

    public ObjectNote(){}
    public ObjectNote(String content){
        this.content=content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
