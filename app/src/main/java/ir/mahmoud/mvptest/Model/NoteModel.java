package ir.mahmoud.mvptest.Model;

import android.content.Context;
import android.widget.Toast;

import ir.mahmoud.mvptest.Other.Interfaces.MVP_Main;
import ir.mahmoud.mvptest.Other.Objects.ObjectNote;
import ir.mahmoud.mvptest.Presenter.MainPresenter;

/**
 * Created by soheilsystem on 2/22/2018.
 */

public class NoteModel implements MVP_Main.ModelOps_Presenter {
    MVP_Main.PresenterOps_Model mModel ;
    Context context;

    public NoteModel(Context context){
//        this.mModel = mModel;
        this.context = context;
    }


    @Override
    public void insertNote(ObjectNote objectNote) {
//        Toast.makeText(context , objectNote.getContent(),Toast.LENGTH_LONG).show();
        objectNote.save();
        // send ok status to presenter
    }
}
