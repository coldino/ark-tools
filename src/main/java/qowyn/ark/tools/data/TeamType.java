package qowyn.ark.tools.data;

public enum TeamType {

  NON_PLAYER, PLAYER, TRIBE, BREEDING, UNKNOWN;

  public static final int PLAYER_START = 50000;

  public static final int TRIBE_START = 1000000000;

  public static final int BREEDING_ID = 2000000000;

  public static TeamType forTargetingTeam(int teamId) {
    if (teamId < PLAYER_START) {
      return NON_PLAYER;
    }

    if (teamId < TRIBE_START) {
      return PLAYER;
    }

    if (teamId < BREEDING_ID) {
      return TRIBE;
    }

    return teamId == 2000000000 ? BREEDING : UNKNOWN;
  }

}
