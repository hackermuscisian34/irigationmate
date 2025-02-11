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
import androidx.compose.ui.text.style.*
@Composable
fun Registeration() {
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
				.padding(top = 216.dp,)
				.verticalScroll(rememberScrollState())
		){
			Text("let’s Get Started",
				color = Color(0xFFFFFFFF),
				fontSize = 40.sp,
				fontWeight = FontWeight.Bold,
				textAlign = TextAlign.Center,
				modifier = Modifier
					.padding(bottom = 68.dp,)
			)
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 32.dp,start = 25.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
			){
				Column(
					modifier = Modifier
						.padding(vertical = 19.dp,horizontal = 29.dp,)
				){
					Text("Enter Your Email",
						color = Color(0xFF000000),
						fontSize = 20.sp,
					)
				}
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 32.dp,start = 25.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
			){
				Column(
					modifier = Modifier
						.padding(vertical = 18.dp,horizontal = 29.dp,)
				){
					Text("Confirm Your Mail",
						color = Color(0xFF000000),
						fontSize = 20.sp,
					)
				}
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 32.dp,start = 25.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
			){
				Column(
					modifier = Modifier
						.padding(vertical = 18.dp,horizontal = 29.dp,)
				){
					Text("Enter Your Password",
						color = Color(0xFF000000),
						fontSize = 20.sp,
					)
				}
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 79.dp,start = 25.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
			){
				Column(
					modifier = Modifier
						.padding(vertical = 20.dp,horizontal = 29.dp,)
				){
					Text("Confirm Your Password",
						color = Color(0xFF000000),
						fontSize = 20.sp,
					)
				}
			}
			OutlinedButton(
				onClick = { println("Pressed!") },
				border = BorderStroke(0.dp, Color.Transparent),
				colors = ButtonDefaults.outlinedButtonColors(backgroundColor = Color.Transparent),
				contentPadding = PaddingValues(),
				modifier = Modifier
					.padding(bottom = 35.dp,start = 63.dp,)
					.clip(shape = RoundedCornerShape(30.dp))
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
					modifier = Modifier
						.padding(vertical = 17.dp,horizontal = 71.dp,)
				){
					Text("  Register",
						color = Color(0xFF0D17A3),
						fontSize = 24.sp,
						fontWeight = FontWeight.Bold,
					)
				}
			}
			Text("Already Registered?  Log in",
				color = Color(0xFFFFFFFF),
				fontSize = 15.sp,
				fontWeight = FontWeight.Bold,
				modifier = Modifier
					.padding(start = 47.dp,)
					.width(213.dp)
			)
		}
	}
}