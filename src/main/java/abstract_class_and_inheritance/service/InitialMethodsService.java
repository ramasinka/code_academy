package abstract_class_and_inheritance.service;

/**
 * Created by CodeAcademy on 2017.07.05.
 */
public class InitialMethodsService {

    public void initialMethods(InputValueService inputValueService){
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            String scannerValue = inputValueService.getScannerValue();
            int convertedValue = inputValueService.convertStringToInt(scannerValue);
            sum = inputValueService.sumConvertedValue(convertedValue, sum);
        }
        System.out.println(sum);
    }
}
