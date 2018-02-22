package ir.mahmoud.mvptest.View.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import ir.mahmoud.mvptest.Model.NoteModel;
import ir.mahmoud.mvptest.Other.Interfaces.MVP_Main;
import ir.mahmoud.mvptest.Presenter.MainPresenter;
import ir.mahmoud.mvptest.R;

public class MainActivity extends AppCompatActivity implements MVP_Main.ViewOps_Presenter {

    MVP_Main.PresenterOps_View mPresenter ;
    MVP_Main.ModelOps_Presenter mModel ;
    MVP_Main.ViewOps_Presenter mView;


    EditText edt ;
    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setup();
        init();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.insertNoteBtnClick(edt);
            }
        });
    }

    private void setup() {
        mView = this;
        mModel = new NoteModel(this);
        mPresenter = new MainPresenter(this,mModel,mView);

    }

    private void init() {
        edt = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.tv);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTextView(String text) {
        tv.setText(text);
    }

    public void submit(View view) {
        mPresenter.getEditText(edt);
    }
}
