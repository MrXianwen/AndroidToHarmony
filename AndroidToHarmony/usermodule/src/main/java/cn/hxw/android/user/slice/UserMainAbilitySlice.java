package cn.hxw.android.user.slice;

import cn.hxw.android.user.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Component;

import java.util.HashSet;
import java.util.Set;

public class UserMainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_user_main);
        findComponentById(ResourceTable.Id_btn_to_android).setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Set<String> entities = new HashSet<>();
                entities.add("android.intent.category.LAUNCHER");
                Operation operation = new Intent.OperationBuilder()
                        .withBundleName("cn.hxw.android.harmony")
                        .withAbilityName("cn.hxw.android.harmony.AndroidMainActivity")
                        .withAction("android.intent.action.MAIN")
                        .withFlags(Intent.FLAG_NOT_OHOS_COMPONENT)
                        .withEntities(entities)
                        .build();
                intent.setOperation(operation);
                startAbility(intent);
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
