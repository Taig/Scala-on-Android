public class MyActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.view );

        TextView title = (TextView) findViewById( R.id.my_title );
        title.setText( "Hello Java!" );
    }
}