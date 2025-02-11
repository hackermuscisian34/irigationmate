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
fun ConnectionError() {
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
				.padding(top = 200.dp,end = 56.dp,)
				.verticalScroll(rememberScrollState())
		){
			CoilImage(
				imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/1ddc807b-dcdc-40eb-8adc-823ccec2beb8"},
				imageOptions = ImageOptions(contentScale = ContentScale.Crop),
				modifier = Modifier
					.padding(start = 61.dp,)
					.height(302.dp)
					.fillMaxWidth()
			)
			Box(
				modifier = Modifier
					.padding(bottom = 162.dp,start = 111.dp,)
			){
				Column(
					modifier = Modifier
						.width(231.dp)
						.height(54.dp)
				){
					Column(
						modifier = Modifier
							.height(54.dp)
							.fillMaxWidth()
					){
					}
				}
				Text("Connection Error",
					color = Color(0xFF0F1EFA),
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold,
					modifier = Modifier
						.offset(x = -3.dp, y = 7.dp)
						.align(Alignment.TopStart)
						.padding(bottom = 7.dp)
				)
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(start = 87.dp,)
					.clip(shape = RoundedCornerShape(30.dp))
					.width(259.dp)
					.height(61.dp)
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
					horizontalAlignment = Alignment.CenterHorizontally,
					modifier = Modifier
						.padding(vertical = 17.dp,)
				){
					Text("   Try Again",
						color = Color(0xFFFAFAFA),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
					)
				}
			}
		}
	}
}