package com.example.geoblinker.ui.main.profile.techsupport

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import com.example.geoblinker.R
import com.example.geoblinker.ui.BackButton
import com.example.geoblinker.ui.CustomButton
import com.example.geoblinker.ui.TypeColor
import com.example.geoblinker.ui.theme.sdp

@Composable
fun TechSupport(
    toFrequentQuestions: () -> Unit,
    toMakeRequest: () -> Unit,
    toChatWithTechSupport: () -> Unit,
    toBack: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.tech_support),
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(Modifier.height(20.sdp()))
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.tech_support),
            contentDescription = null,
            modifier = Modifier.size(62.sdp()),
            tint = Color.Unspecified
        )
        Spacer(Modifier.height(87.sdp()))
        CustomButton(
            text = stringResource(R.string.frequent_questions),
            onClick = toFrequentQuestions,
            typeColor = TypeColor.Green,
            height = 55,
            radius = 10
        )
        Spacer(Modifier.height(15.sdp()))
        CustomButton(
            text = stringResource(R.string.make_request),
            onClick = toMakeRequest,
            typeColor = TypeColor.Black,
            rightIcon = R.drawable.request,
            height = 55,
            radius = 10
        )
        Spacer(Modifier.height(15.sdp()))
        CustomButton(
            text = stringResource(R.string.chat_with_tech_support),
            onClick = toChatWithTechSupport,
            typeColor = TypeColor.Black,
            rightIcon = R.drawable.chat,
            height = 55,
            radius = 10
        )
    }

    BackButton(
        onClick = toBack
    )
}