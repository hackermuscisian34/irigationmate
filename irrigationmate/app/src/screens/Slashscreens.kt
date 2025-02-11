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
fun Slashscreen() {
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
					color = Color(0xFF2E13FE),
				)
				.padding(top = 389.dp,start = 80.dp,)
				.verticalScroll(rememberScrollState())
		){
			Text("   IRRIGATION\n      MATE  ",
				color = Color(0xFFFFFFFF),
				fontSize = 40.sp,
				fontWeight = FontWeight.Bold,
				fontStyle = FontStyle.Italic,
				modifier = Modifier
					.padding(bottom = 99.dp,)
					.offset(y = -99.dp)
					.width(460.dp)
			)
			Column(
				modifier = Modifier
					.fillMaxWidth()
			){
				Column(
					modifier = Modifier
						.height(16.dp)
						.fillMaxWidth()
				){
				}
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.clip(shape = RoundedCornerShape(30.dp))
					.width(259.dp)
					.height(61.dp)
					.background(
						color = Color(0xFFD9D9D9),
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
					Text("Get Started",
						color = Color(0xFF0D17A3),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
					)
				}
			}
		}
	}
}