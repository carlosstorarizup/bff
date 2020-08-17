package com.example.bff.builder

import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput
import com.example.bff.dataClass.Credentials
import com.example.bff.dataClass.RequestCredentials

class LoginTransitionTest {

    fun createLoginScreen() = Screen(
            child = Container(
                    context = ContextData(
                            id = "credentials",
                            value = Credentials(username = "", password = "")
                    ),
                    children = listOf(
                            TextInput(
                                    placeholder = "Username",
                                    value = "@{credentials.username}",
                                    onChange = listOf(
                                            SetContext(
                                                    contextId = "credentials",
                                                    path = "username",
                                                    value = "@{onChange.value}"
                                            )
                                    )
                            ),
                            TextInput(
                                    placeholder = "Password",
                                    value = "@{credentials.password}",
                                    onChange = listOf(
                                            SetContext(
                                                    contextId = "credentials",
                                                    path = "password",
                                                    value = "@{onChange.value}"
                                            )
                                    )
                            ),
                            Button(
                                    text = "Login",
                                    onPress = listOf(
                                            SendRequest(
                                                    url = "http://beagle.free.beeceptor.com/@{credentials.username}",
                                                    method = RequestActionMethod.POST,
                                                    data = RequestCredentials(
                                                            username = "@{credentials.username}",
                                                            password = "@{credentials.password}",
                                                            authType = "login"
                                                    ),
                                                    onSuccess = listOf(
                                                            Alert(
                                                                    title = "You are logged-in",
                                                                    message = "@{credentials.username}"
                                                            )

                                                    )
                                            )
                                    )
                            )
                    )
            )


    )
}