import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp


@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }
    StatelessCounter(modifier, count, { count++ })
}

@Composable
fun StatelessCounter(modifier: Modifier = Modifier,count : Int,countIncrement:()->Unit){
    Column (modifier  = modifier.padding(16.dp)) {


        if(count>0){

            Text("You've had $count glasses.")
        }
        Button(onClick = countIncrement , Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }
    }
}

