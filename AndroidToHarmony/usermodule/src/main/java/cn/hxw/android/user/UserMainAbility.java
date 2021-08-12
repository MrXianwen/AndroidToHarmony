package cn.hxw.android.user;

import cn.hxw.android.user.slice.UserMainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class UserMainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(UserMainAbilitySlice.class.getName());
    }
}
