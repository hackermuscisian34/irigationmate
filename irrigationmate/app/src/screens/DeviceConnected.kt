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
fun DeviceConnected() {
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
				.padding(top = 132.dp,)
				.verticalScroll(rememberScrollState())
		){
			Box(
				modifier = Modifier
					.padding(bottom = 146.dp,)
			){
				Row(
					modifier = Modifier
						.fillMaxWidth()
				){
					CoilImage(
						imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/50091ff2-d907-42da-9155-9dc92d5ad9cc"},
						imageOptions = ImageOptions(contentScale = ContentScale.Crop),
						modifier = Modifier
							.width(402.dp)
							.height(408.dp)
					)
				}
				Text("Device Connected",
					color = Color(0xFF0F1EFA),
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold,
					modifier = Modifier
						.offset(x = -99.dp, y = -23.dp)
						.align(Alignment.BottomEnd)
				)
				Column(
					modifier = Modifier
						.offset(x = -68.dp, y = 0.dp)
						.align(Alignment.BottomEnd)
						.width(231.dp)
						.height(54.dp)
				){
				}
			}
			TextFieldView(
				placeholder = "      Next",
				value = textField1.value,
				onValueChange = { newText -> textField1.value = newText },
				textStyle = TextStyle(
					color = Color(0xFFFAFAFA),
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold,
				),
				modifier = Modifier
					.padding(horizontal = 67.dp,)
					.clip(shape = RoundedCornerShape(30.dp))
					.fillMaxWidth()
					.background(
						color = Color(0xFF4700D5),
						shape = RoundedCornerShape(30.dp)
					)
					.shadow(
						elevation = 4.dp,
						spotColor = Color(0x40000000),
					)
					.padding(vertical = 18.dp,horizontal = 93.dp,)
			)
		}
	}
}