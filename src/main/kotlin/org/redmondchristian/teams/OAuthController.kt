package org.redmondchristian.teams

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OAuthController @Autowired constructor(private val client: PlanningCenterLoginClient) {

    @Bean
    fun retrieveToken(): (String) -> TokenResult {
        return {
            client.retrieveToken(TokenRequest(code = it))
        }
    }

}