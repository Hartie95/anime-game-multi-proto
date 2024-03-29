package data.activity.user_generated_content

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

/**
 *
 */
@AddedIn(Version.GI_2_7_0)
@ProtoEnum
enum class GetUgcType {
    @AltName("GET_UGC_TYPE_NONE")
    GET_UGC_NONE,
    GET_UGC_TYPE_MINE,
    GET_UGC_TYPE_PUBLISH
}