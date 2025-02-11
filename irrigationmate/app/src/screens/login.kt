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
@Composable
fun LogIn() {
	val textField1 = remember { mutableStateOf("") }
	val textField2 = remember { mutableStateOf("") }
	val textField3 = remember { mutableStateOf("") }
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
				.padding(top = 190.dp,)
				.verticalScroll(rememberScrollState())
		){
			Column(
				modifier = Modifier
					.padding(bottom = 79.dp,start = 64.dp,end = 64.dp,)
					.height(262.dp)
					.fillMaxWidth()
			){
				Column(
					modifier = Modifier
						.height(102.dp)
						.fillMaxWidth()
						.padding(top = 73.dp,bottom = 9.dp,start = 1.dp,end = 1.dp,)
				){
					Text("login to your account",
						color = Color(0xFF000000),
						fontSize = 20.sp,
						fontWeight = FontWeight.Bold,
					)
				}
				Text("    Log In",
					fontWeight = FontWeight.Bold,
					modifier = Modifier
						.padding(start = 40.dp,)
						.offset(y = -89.dp)
				)
			}
			TextFieldView(
				placeholder = "Enter Your Email",
				value = textField1.value,
				onValueChange = { newText -> textField1.value = newText },
				textStyle = TextStyle(
					color = Color(0xFF000000),
					fontSize = 20.sp,
				),
				modifier = Modifier
					.padding(bottom = 37.dp,start = 31.dp,end = 31.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.fillMaxWidth()
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
					.padding(vertical = 19.dp,horizontal = 29.dp,)
			)
			TextFieldView(
				placeholder = "Enter Your Password",
				value = textField2.value,
				onValueChange = { newText -> textField2.value = newText },
				textStyle = TextStyle(
					color = Color(0xFF000000),
					fontSize = 20.sp,
				),
				modifier = Modifier
					.padding(bottom = 25.dp,start = 31.dp,end = 31.dp,)
					.border(
						width = 1.dp,
						color = Color(0xFF000000),
						shape = RoundedCornerShape(20.dp)
					)
					.clip(shape = RoundedCornerShape(20.dp))
					.fillMaxWidth()
					.background(
						color = Color(0xFFD9D9D9),
						shape = RoundedCornerShape(20.dp)
					)
					.padding(vertical = 18.dp,horizontal = 29.dp,)
			)
			Text("Forgot password?",
				color = Color(0xFF000000),
				fontSize = 15.sp,
				fontWeight = FontWeight.Bold,
				modifier = Modifier
					.padding(bottom = 94.dp,start = 39.dp,)
			)
			TextFieldView(
				placeholder = "      login",
				value = textField3.value,
				onValueChange = { newText -> textField3.value = newText },
				textStyle = TextStyle(
					color = Color(0xFFFAFAFA),
					fontSize = 24.sp,
					fontWeight = FontWeight.Bold,
				),
				modifier = Modifier
					.padding(horizontal = 68.dp,)
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
					.padding(vertical = 17.dp,horizontal = 93.dp,)
			)
		}
	}
}