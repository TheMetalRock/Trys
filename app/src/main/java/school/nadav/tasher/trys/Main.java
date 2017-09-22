package school.nadav.tasher.trys;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
    }
}
