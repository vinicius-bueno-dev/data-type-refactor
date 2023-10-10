/**package org.leroy.legacy;

public class refactor {
    public void validateBeforeSalve(ParamenterParam param, Errors errors) throws FieldValidationException {
        this.clearValidationError();
        if (param == null) {
            errors.rejectValue("ParameterParam", getKey("ParameterParam.error.save"));
        } else {
            if (param.getParameterDataType() == 1 || param.getParameterDataType() == 6) {
                return;
            }

            if (StringUtils.trimToNull(param.getParamVal()) == null) {
                errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.empty"));
            }

            switch (param.getParameterDataType()) {
                case 2:
                    try {
                        Integer.parseInt(param.getParamVal());
                    } catch (Exception e) {
                        errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.integer"));
                    }
                    break;

                case 3:
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
                    try {
                        dateFormat.parse(param.getParamVal());
                    } catch (Exception e) {
                        errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.date"));
                    }
                    break;

                case 4:
                    SimpleDateFormat dateFormatFull = new SimpleDateFormat("dd/MM/yy HH:mm");
                    try {
                        dateFormatFull.parse(param.getParamVal());
                    } catch (Exception e) {
                        errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.dateFull"));
                    }
                    break;

                case 5:
                    try {
                        Double.parseDouble(param.getParamVal());
                    } catch (Exception e) {
                        errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.double"));
                    }
                    break;

                case 7:
                    try {
                        String vTrue = "true";
                        String vFalse = "false";

                        boolean isTrue = vTrue.equals(param.getParamVal());
                        boolean isFalse = vFalse.equals(param.getParamVal());

                        if (!isTrue) {
                            if (!isFalse) {
                                throw new Exception("none");
                            }
                        }

                        if (!isFalse) {
                            if (!isTrue) {
                                throw new Exception("none");
                            }
                        }
                    } catch (Exception e) {
                        errors.rejectValue("value", getKey("parameterParam.error.save.dsValue.boolean"));
                    }
                    break;
            }
        }
}**/
