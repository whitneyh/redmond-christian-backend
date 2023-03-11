package org.redmondchristian.teams

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

data class TokenRequest(
    val grant_type: String = "authorization_code",
    val code: String,
    val client_id: String = "55e7a5ddcab388c89a5b3d18776491547881f828d8a8f56d76d87e94f72792f6",
    val client_secret: String = "54ce96752f40e7d41ef5050c308c4c405f6741d279381fe3c9cf7883acaf93cd",
    val redirect_uri: String = "http://localhost:3000/auth/complete",
)

data class TokenResult(
    val access_token: String,
    val token_type: String,
    val expires_in: Number,
    val refresh_token: String,
    val scope: String,
    val created_at: Number,
)

@FeignClient("oauth", url = "https://api.planningcenteronline.com")
interface PlanningCenterLoginClient {

    @RequestMapping(method = [RequestMethod.POST], path = ["/oauth/token"])
    fun retrieveToken(request: TokenRequest): TokenResult

}