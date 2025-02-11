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
fun SelectDevice() {
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
				.padding(top = 148.dp,)
				.verticalScroll(rememberScrollState())
		){
			Column(
				modifier = Modifier
					.padding(bottom = 92.dp,start = 85.dp,end = 85.dp,)
					.fillMaxWidth()
					.padding(vertical = 7.dp,horizontal = 22.dp,)
			){
				Text("     Select Device",
					color = Color(0xFF0F1EFA),
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold,
					modifier = Modifier
						.padding(bottom = 9.dp,)
				)
				Column(
					modifier = Modifier
						.width(165.dp)
						.height(8.dp)
						.background(
							color = Color(0xFF000000),
						)
				){
				}
			}
			CoilImage(
				imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/26775c39-09cf-4670-ae2e-e447ec1392d1"},
				imageOptions = ImageOptions(contentScale = ContentScale.Crop),
				modifier = Modifier
					.padding(bottom = 313.dp,start = 25.dp,)
					.width(12.dp)
					.height(21.dp)
			)
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 35.dp,start = 59.dp,)
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
						.padding(vertical = 17.dp,horizontal = 92.dp,)
				){
					Text("      Skip",
						color = Color(0xFFFAFAFA),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
					)
				}
			}
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