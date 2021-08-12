package cn.hxw.android.harmony;

import cn.hxw.android.harmony.slice.HarmonyMainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class HarmonyMainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(HarmonyMainAbilitySlice.class.getName());
    }
}
