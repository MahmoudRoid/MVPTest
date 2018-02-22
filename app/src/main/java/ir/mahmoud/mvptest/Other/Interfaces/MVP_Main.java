package ir.mahmoud.mvptest.Other.Interfaces;


import android.widget.EditText;

import ir.mahmoud.mvptest.Model.NoteModel;
import ir.mahmoud.mvptest.Other.Objects.ObjectNote;

public interface MVP_Main {

    interface PresenterOps_View{
        //PresenterOps call by View
        void insertNoteBtnClick(EditText editText);
        void getEditText(EditText editText);
    }

    interface  PresenterOps_Model{
        //PresenterOps call by Model
    }

    interface ModelOps_Presenter{
        //ModelOps call by Presenter
        void insertNote(ObjectNote objectNote);

    }

    interface ViewOps_Presenter{
        //ViewOps call by Presenter
       void setTextView(String text);
    }

}
