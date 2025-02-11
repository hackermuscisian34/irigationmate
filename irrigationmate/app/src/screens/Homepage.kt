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
import androidx.compose.ui.text.*
import androidx.compose.ui.layout.*
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil3.*
@Composable
fun Homepage() {
	val textField1 = remember { mutableStateOf("") }
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
				.verticalScroll(rememberScrollState())
		){
			Column(
				modifier = Modifier
					.padding(bottom = 64.dp,)
					.fillMaxWidth()
					.background(
						color = Color(0xFF0FDBFA),
					)
					.padding(horizontal = 121.dp,)
			){
				CoilImage(
					imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/acfc487b-931e-42d0-9406-fc35512e4f99"},
					imageOptions = ImageOptions(contentScale = ContentScale.Crop),
					modifier = Modifier
						.padding(top = 88.dp,)
						.height(150.dp)
						.fillMaxWidth()
				)
			}
			Text("Good \nMorning\nuser",
				color = Color(0xFF000000),
				fontSize = 48.sp,
				modifier = Modifier
					.padding(bottom = 121.dp,start = 87.dp,)
					.width(208.dp)
			)
			Row(
				horizontalArrangement = Arrangement.SpaceBetween,
				verticalAlignment = Alignment.CenterVertically,
				modifier = Modifier
					.padding(horizontal = 44.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(50.dp)
					)
					.clip(shape = RoundedCornerShape(50.dp))
					.fillMaxWidth()
					.background(
						color = Color(0xFFFFFEFE),
						shape = RoundedCornerShape(50.dp)
					)
					.padding(start = 81.dp,end = 42.dp,)
			){
				TextFieldView(
					placeholder = "   Device Connected",
					value = textField1.value,
					onValueChange = { newText -> textField1.value = newText },
					textStyle = TextStyle(
						color = Color(0xFF000000),
						fontSize = 24.sp,
					),
					modifier = Modifier
						.weight(1f)
						.padding(vertical = 12.dp,)
				)
				CoilImage(
					imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/a6538458-72e2-4df7-bb90-2f54862a58ae"},
					imageOptions = ImageOptions(contentScale = ContentScale.Crop),
					modifier = Modifier
						.width(19.dp)
						.height(20.dp)
				)
			}
		}
	}
}