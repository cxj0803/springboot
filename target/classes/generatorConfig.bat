@echo -----------------------------------------------------------------------------
@echo Mybatis ����������
@echo -----------------------------------------------------------------------------

@rem ���ñ�������ȡ��ǰĿ¼
set dir=%cd%
@echo E:\demo\springbootTest\src\main\resources%dir%
@echo ��ʼ���ɴ���

java -jar E:\demo\springbootTest\src\main\resources\mybatis-generator-core-1.3.6.jar -configfile E:\demo\springbootTest\src\main\resources\generatorConfig.xml -overwrite
@pause