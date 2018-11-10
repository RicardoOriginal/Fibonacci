package ricardo.com.br.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtValor = findViewById(R.id.edtValor);
        Button btCalcular = findViewById(R.id.btCalculcar);
        final TextView tvResultado = findViewById(R.id.tvResultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.w("teste", String.valueOf(fibonacci(Integer.parseInt(edtValor.getText().toString()))));
                tvResultado.setText(String.valueOf(fibonacci(Integer.parseInt(edtValor.getText().toString()))));
                edtValor.setText("");
            }
        });
    }

    long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
