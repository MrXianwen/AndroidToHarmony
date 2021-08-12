package cn.hxw.android.harmony.slice;

import cn.hxw.android.harmony.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;

public class HarmonyMainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        findComponentById(ResourceTable.Id_btn_to_android).setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
//                Intent intent = new Intent();
//                Operation operation = new Intent.OperationBuilder()
//                        .withDeviceId("")
//                        .withBundleName("cn.hxw.android.harmony")
//                        .withAbilityName("cn.hxw.android.harmony.AndroidMainActivity")
//                        .withFlags(Intent.FLAG_NOT_OHOS_COMPONENT)
//                        .build();
//                intent.setOperation(operation);
//                startAbility(intent);
            }
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
