package br.com.mats.howto;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);

        //codigo Action Bar
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ActionBar");
        mToolbar.setSubtitle("by hidzz!");



        //codigo StandAloneToolbar - mais novo, mais controle do q action bar
//        mToolbar.setTitle("HowTo");
//        mToolbar.setSubtitle("by hidzz!");
//        mToolbar.setNavigationIcon(R.drawable.ic_menu);


        /*if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            mToolbar.setElevation(10f);
        }*/


        //codigo para StandAloneToolbar
//        mToolbar.inflateMenu(R.menu.menu_main);
//        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                String title = (String) item.getTitle();
//                Toast.makeText(MainActivity.this, title + " selected", Toast.LENGTH_SHORT).show();
//
//                switch (item.getItemId()){
//
//                    case R.id.pesquisar:
//                        //codigo aqui
//                        break;
//                    case R.id.editar:
//                        //codigo aqui
//                        break;
//
//                }
//                return true;
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        String msg = "";
        switch (item.getItemId()){
            case R.id.pesquisar:
                msg = getString(R.string.pesquisar);
                break;
            case R.id.editar:
                msg = getString(R.string.editar);
                break;
            case R.id.deletar:
                msg = getString(R.string.deletar);
                break;
            case R.id.ajuda:
                msg = getString(R.string.ajuda);
                break;
            case R.id.sobre:
                msg = getString(R.string.sobre);
                break;
        }

        Toast.makeText(MainActivity.this, msg + " clicked", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }


}
