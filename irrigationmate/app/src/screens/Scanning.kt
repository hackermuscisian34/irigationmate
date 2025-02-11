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
fun Scanning() {
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
				.padding(top = 180.dp,)
				.verticalScroll(rememberScrollState())
		){
			Column(
				modifier = Modifier
					.padding(bottom = 19.dp,start = 76.dp,)
					.fillMaxWidth()
			){
				CoilImage(
					imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/51f7a4e9-82e5-4a04-b835-279ab741bd54"},
					imageOptions = ImageOptions(contentScale = ContentScale.Crop),
					modifier = Modifier
						.padding(bottom = 36.dp,)
						.height(278.dp)
						.fillMaxWidth()
				)
				Box{
					Column(
						modifier = Modifier
							.fillMaxWidth()
					){
						Column(
							modifier = Modifier
								.height(54.dp)
								.fillMaxWidth()
						){
						}
					}
					Text("Search For Devices",
						color = Color(0xFF0F1EFA),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
						modifier = Modifier
							.offset(x = -4.dp, y = 7.dp)
							.align(Alignment.TopStart)
							.padding(bottom = 7.dp)
					)
				}
			}
			Text("1.Connect the IOT and your device in same    \n    network.",
				color = Color(0xFF000000),
				fontSize = 16.sp,
				fontWeight = FontWeight.Bold,
				modifier = Modifier
					.padding(bottom = 36.dp,start = 42.dp,end = 42.dp,)
			)
			Text("2.The IOT device should be in the range of\n     your  WIFI router.",
				color = Color(0xFF000000),
				fontSize = 16.sp,
				fontWeight = FontWeight.Bold,
				modifier = Modifier
					.padding(bottom = 57.dp,start = 42.dp,)
					.width(308.dp)
			)
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(start = 59.dp,)
					.clip(shape = RoundedCornerShape(30.dp))
					.background(
						color = Color(0xFF4700D5),
						shape = RoundedCornerShape(30.dp)
					)
					.shadow(
						elevation = 4.dp,
						spotColor = Color(0x40000000),
					)
			){
				Column(
					modifier = Modifier
						.padding(vertical = 18.dp,horizontal = 93.dp,)
				){
					Text("      Next",
						color = Color(0xFFFAFAFA),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
					)
				}
			}
		}
	}
}