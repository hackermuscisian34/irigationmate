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
import androidx.compose.ui.layout.*
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil3.*
@Composable
fun Monitor() {
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
						.padding(horizontal = 25.dp,)
				){
					CoilImage(
						imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/1eec632a-d7af-49e7-8e3a-49a66b8d036c"},
						imageOptions = ImageOptions(contentScale = ContentScale.Crop),
						modifier = Modifier
							.padding(top = 29.dp,)
							.height(24.dp)
							.fillMaxWidth()
					)
				}
				Text("                Weather                 \n        Monitoring",
					color = Color(0xFFFFFEFE),
					modifier = Modifier
						.padding(start = 82.dp,)
						.offset(y = -159.dp)
				)
			}
		}
	}
}