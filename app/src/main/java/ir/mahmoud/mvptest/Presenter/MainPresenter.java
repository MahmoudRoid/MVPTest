package ir.mahmoud.mvptest.Presenter;

import android.content.Context;
import android.widget.EditText;
import ir.mahmoud.mvptest.Other.Interfaces.MVP_Main;
import ir.mahmoud.mvptest.Other.Objects.ObjectNote;

/**
 * Created by soheilsystem on 2/22/2018.
 */

public class MainPresenter implements MVP_Main.PresenterOps_View {

    Context context;
    MVP_Main.ModelOps_Presenter noteModel;
    MVP_Main.ViewOps_Presenter mView;

    public MainPresenter(Context context,MVP_Main.ModelOps_Presenter noteModel,MVP_Main.ViewOps_Presenter mView){
        this.context = context;
        this.noteModel= noteModel;
        this.mView = mView;
    }


    @Override
    public void insertNoteBtnClick(EditText editText) {
        if(editText.getText().toString().length()>0){
            ObjectNote ob = new ObjectNote(editText.getText().toString());
            noteModel.insertNote(ob);
        }
    }

    @Override
    public void getEditText(EditText editText) {
        String content = editText.getText().toString();
        mView.setTextView(content);
    }


}
