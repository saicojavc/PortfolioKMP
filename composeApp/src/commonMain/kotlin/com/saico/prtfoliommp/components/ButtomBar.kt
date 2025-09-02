package com.saico.prtfoliommp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.unit.dp
import com.saico.prtfoliommp.util.WindowSizeClass
import org.jetbrains.compose.resources.painterResource
import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.email
import portfolio.composeapp.generated.resources.github
import portfolio.composeapp.generated.resources.`in`
import portfolio.composeapp.generated.resources.phone

@Composable
fun BottomBar(windowSizeClass: WindowSizeClass) {

    val uriHandler = LocalUriHandler.current
    val linkedinUrl =
        "https://www.linkedin.com/in/jorge-adri%C3%A1n-vald%C3%A9s-camacho-21b371221?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"
    val githubUri = "https://github.com/saicojavc"

    when (windowSizeClass) {
        WindowSizeClass.Compact -> CompactBottomBar(uriHandler, linkedinUrl, githubUri)
        WindowSizeClass.Medium -> ExpandBottomBar(uriHandler, linkedinUrl, githubUri)
        WindowSizeClass.Expanded -> ExpandBottomBar(uriHandler, linkedinUrl, githubUri)
    }
}


@Composable
fun ExpandBottomBar(uriHandler: UriHandler, linkedinUrl: String, githubUri: String) {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {

        Image(
            modifier = Modifier
                .padding(4.dp)
                .background(color = Color.White, shape = CircleShape)
                .size(35.dp)
                .clickable { uriHandler.openUri(linkedinUrl) },
            painter = painterResource(Res.drawable.`in`),
            contentDescription = "LinkedIn Profile"
        )
        Image(

            modifier = Modifier
                .padding(4.dp)
                .background(color = Color.White, shape = CircleShape)
                .size(35.dp)
                .clickable { uriHandler.openUri(githubUri) },
            painter = painterResource(Res.drawable.github),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .padding(4.dp)
                .background(color = Color.White, shape = CircleShape)
                .size(35.dp),
            painter = painterResource(Res.drawable.phone),
            contentDescription = null
        )
        Text(
            text = "+1 305 342 0620",
            color = Color.White,
        )
        Image(

            modifier = Modifier
                .padding(4.dp)
                .background(color = Color.White, shape = CircleShape)
                .size(35.dp),
            painter = painterResource(Res.drawable.email),
            contentDescription = null
        )
        Text(
            text = "john.mckinley@examplepetstore.com",
            color = Color.White,
        )

    }
}


@Composable
fun CompactBottomBar(uriHandler: UriHandler, linkedinUrl: String, githubUri: String) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Image(
                    modifier = Modifier
                        .padding(4.dp)
                        .background(color = Color.White, shape = CircleShape)
                        .size(35.dp)
                        .clickable { uriHandler.openUri(linkedinUrl) },
                    painter = painterResource(Res.drawable.`in`),
                    contentDescription = "LinkedIn Profile"
                )
                Image(

                    modifier = Modifier
                        .padding(4.dp)
                        .background(color = Color.White, shape = CircleShape)
                        .size(35.dp)
                        .clickable { uriHandler.openUri(githubUri) },
                    painter = painterResource(Res.drawable.github),
                    contentDescription = null
                )
            }
            Image(
                modifier = Modifier
                    .padding(4.dp)
                    .background(color = Color.White, shape = CircleShape)
                    .size(35.dp),
                painter = painterResource(Res.drawable.phone),
                contentDescription = null
            )
            Text(
                text = "+1 305 342 0620",
                color = Color.White,
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(

                modifier = Modifier
                    .padding(4.dp)
                    .background(color = Color.White, shape = CircleShape)
                    .size(35.dp),
                painter = painterResource(Res.drawable.email),
                contentDescription = null
            )
            Text(
                text = "john.mckinley@examplepetstore.com",
                color = Color.White,
            )
        }
    }
}