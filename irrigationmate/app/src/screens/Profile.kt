import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
@Composable
fun Profile() {
	Column(
		modifier = Modifier
			.fillMaxWidth()
			.fillMaxHeight()
			.background(
				color = Color(0xFFFFFFFF),
			)
	){
		Column(
			modifier = Modifier
				.fillMaxWidth()
				.weight(1f)
				.background(
					color = Color(0xFFFFFFFF),
				)
				.padding(bottom = 606.dp,)
				.verticalScroll(rememberScrollState())
		){
			Column(
				modifier = Modifier
					.height(268.dp)
					.fillMaxWidth()
			){
				Column(
					modifier = Modifier
						.height(268.dp)
						.fillMaxWidth()
						.background(
							color = Color(0xFF0FDBFA),
						)
				){
				}
				Text("               Profile",
					color = Color(0xFFFFFEFE),
					modifier = Modifier
						.padding(start = 129.dp,)
						.offset(y = -127.dp)
				)
			}
		}
	}
}