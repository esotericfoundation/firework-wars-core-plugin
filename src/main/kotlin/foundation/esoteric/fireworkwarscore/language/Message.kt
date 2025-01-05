package foundation.esoteric.fireworkwarscore.language

enum class Message {
    //Firework Wars Core
    SET_LANGUAGE_SUCCESSFULLY,
    UNKNOWN_LANGUAGE,

    GRANTED_RANK_SUCCESSFULLY,
    REVOKED_RANK_SUCCESSFULLY,
    RANK_GRANTED,
    RANK_REVOKED,
    INVALID_RANK,

    FRIEND_REQUEST_SENT,
    FRIEND_REQUEST_FROM,
    FRIEND_REQUEST_CANCELLED,
    FRIEND_REQUEST_CANCELLED_BY,
    FRIEND_REQUEST_DENIED,
    FRIEND_REQUEST_DENIED_BY,
    FRIEND_REQUEST_EXPIRED,
    FRIEND_REQUEST_FROM_EXPIRED,
    YOU_ARE_NOW_FRIENDS,
    REMOVED_FRIEND,
    YOU_WERE_REMOVED_AS_FRIEND,
    FRIEND_LIST_SEPARATOR,
    FRIEND_LIST_TITLE,
    FRIEND_LIST_PAGING,
    FRIENDS_PARTY_CREATED,

    CANNOT_FRIEND_SELF,
    YOU_ARE_ALREADY_FRIENDS,
    NO_FRIEND_REQUESTS_FROM,
    NO_FRIEND_REQUESTS_TO,
    PLAYER_NOT_FRIENDED,
    YOU_HAVE_NO_FRIENDS,

    BLOCKED_PLAYER,
    UNBLOCKED_PLAYER,

    CANNOT_BLOCK_SELF,
    PLAYER_ALREADY_BLOCKED,
    PLAYER_NOT_BLOCKED,

    UNKNOWN_PLAYER,

    STATUS_OFFLINE,
    STATUS_PLAYING,
    STATUS_IN_LOBBY,

    COMING_SOON,

    // Firework Wars Lobby
    PLAYER_JOINED_LOBBY,
    RANKED_PLAYER_JOINED_LOBBY,
    WELCOME,

    CURRENT_PLAYERS,
    NO_ARENAS_AVAILABLE,
    NO_ARENAS_AVAILABLE_LORE,

    TABLIST_HEADER,
    TABLIST_FOOTER,

    LOBBY_SB_TITLE,
    LOBBY_SB_RANK,
    LOBBY_SB_ACHIEVEMENTS,
    LOBBY_SB_PLAYERS,
    LOBBY_SB_FRIENDS,
    LOBBY_SB_IP,

    // Firework Wars
    INVALID_ITEM,

    WOOL,
    WOOL_LORE,

    FIREWORK_RIFLE,
    FIREWORK_RIFLE_LORE,
    FIREWORK_RIFLE_AMMO,
    FIREWORK_RIFLE_AMMO_LORE,

    FIREWORK_SHOTGUN,
    FIREWORK_SHOTGUN_LORE,
    FIREWORK_SHOTGUN_AMMO,
    FIREWORK_SHOTGUN_AMMO_LORE,

    ROCKET_LAUNCHER,
    ROCKET_LAUNCHER_LORE,
    ROCKET_LAUNCHER_AMMO,
    ROCKET_LAUNCHER_AMMO_LORE,

    PLAYER_COMPASS,
    PLAYER_COMPASS_LORE_NOT_TRACKING,
    PLAYER_COMPASS_LORE_TRACKING,
    PLAYER_COMPASS_NO_ENEMY,
    PLAYER_COMPASS_TRACKING_TARGET,
    PLAYER_COMPASS_ACTIONBAR_INFO,

    ENCHANTED_GOLDEN_APPLE,
    ENCHANTED_GOLDEN_APPLE_LORE,

    GOLDEN_APPLE,
    GOLDEN_APPLE_LORE,

    HEALING_POTION,
    HEALING_POTION_LORE,

    TNT,
    TNT_LORE,

    THROWABLE_TNT,
    THROWABLE_TNT_LORE,

    MILITARY_HELMET,
    MILITARY_HELMET_LORE,

    HEAVY_ARMOR,
    HEAVY_ARMOR_LORE,

    COMBAT_ARMOR,
    COMBAT_ARMOR_LORE,

    HORSE_ARMOR,
    HORSE_ARMOR_LORE,

    FLINT_AND_STEEL,
    FLINT_AND_STEEL_LORE,

    SHEARS,
    SHEARS_LORE,

    WATER_BUCKET,
    WATER_BUCKET_LORE,

    WARDENS_WRATH,
    WARDENS_WRATH_LORE,
    WARDENS_WRATH_BROKEN,
    WARDENS_WRATH_BROKEN_LORE,

    WARDENS_WRATH_ON_COOLDOWN,

    GAME_STARTING_IN_TIME_PLURAL,
    GAME_STARTING_IN_TIME_SINGULAR,
    GAME_STARTED,
    COUNTDOWN_CANCELLED,

    YOU_ARE_ON_TEAM,

    EVENT_CHEST_REFILL,
    EVENT_CHEST_REFILL_WARNING,
    EVENT_SUPPLY_DROP,
    EVENT_ENDGAME,

    WARDEN_INTRODUCTION_1,
    WARDEN_INTRODUCTION_2,
    WARDEN_INTRODUCTION_3,
    WARDEN_INTRODUCTION_4,

    WARDEN_TARGET_PLAYER,
    WARDEN_TARGET_PLAYER_WITH_WRATH,

    WARDEN_YAP_1,
    WARDEN_YAP_2,
    WARDEN_YAP_3,
    WARDEN_YAP_4,
    WARDEN_YAP_5,

    WARDEN_INJURED_YAP_1,
    WARDEN_INJURED_YAP_2,
    WARDEN_INJURED_YAP_3,

    WARDEN_KILL_WHISPER,
    WARDEN_KILL_1,
    WARDEN_KILL_2,
    WARDEN_KILL_3,

    WARDEN_HALF_HEALTH,
    WARDEN_DEFEATED,

    NO_FRIENDLY_FIRE,
    NOT_YOUR_HORSE,

    TEAM_ELIMINATED,
    TEAM_WON,
    DRAW,

    PLAYER_KILLED_BY_DISCONNECTION,
    PLAYER_RECONNECTED_AS_SPECTATOR,

    SPECTATING_PLAYER,
    STOPPED_SPECTATING_PLAYER,
    TELEPORTED_TO_PLAYER,
    TARGET_LOST,

    NOT_IN_LOBBY,
    INVALID_ARENA,
    ARENA_FULL,
    GAME_ALREADY_PLAYING,
    GAME_ALREADY_CONTAINS_PLAYER,
    GAME_RELOADING,
    NOT_IN_GAME,

    SB_TITLE,
    SB_SEPARATOR,

    SB_TEAM,
    SB_OWN_TEAM,
    SB_ELIMINATED_TEAM,
    SB_ELIMINATED_OWN_TEAM,

    SB_EVENT_SUPPLY_DROP,
    SB_EVENT_SUPPLY_DROP_SOON,
    SB_EVENT_ENDGAME,
    SB_EVENT_ENDGAME_SOON,
    SB_EVENT_GAME_END,
    SB_EVENT_GAME_END_SOON,

    SB_KILL_COUNT,
    SB_DAMAGE_DEALT,

    YOU_DIED,
    YOU_ARE_NOW_SPECTATOR,

    YOU_WIN,
    YOU_LOSE,
    GAME_DRAWN,

    ARENA_JOIN,
    ARENA_LEAVE,
}