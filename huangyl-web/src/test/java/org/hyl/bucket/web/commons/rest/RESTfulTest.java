package org.hyl.bucket.web.commons.rest;

import org.assertj.core.api.Assertions;
import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.commons.result.enums.NetworkEnum;
import org.hyl.bucket.web.commons.rest.enums.RestMessageEnum;
import org.hyl.bucket.web.commons.rest.enums.RestTypeEnum;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class RESTfulTest {

    private Integer state;

    private String message;

    private List<Integer> data;

    private String e;

    private Map<String, Integer> params;

    @Before
    public void setUp() throws Exception {
        this.state = new Random().nextInt(400) + 100;
        this.message = "REST_TEST";
        this.data = new ArrayList<>();
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.e = new RuntimeException("REST_ERROR").getMessage();
        this.params = new HashMap<>();
        this.params.put("id", new Random().nextInt(100));
    }

    private void compare(Message a, Message b) throws Exception {
        Assertions.assertThat(a.getState()).isEqualTo(b.getState());
        Assertions.assertThat(a.getMessage()).isEqualTo(b.getMessage());
        Assertions.assertThat(a.getData()).isEqualTo(b.getData());
        Assertions.assertThat(a.getSuccess()).isEqualTo(b.getSuccess());
        Assertions.assertThat(a.getE()).isEqualTo(b.getE());
        Assertions.assertThat(a.getParams()).isEqualTo(b.getParams());
    }

    @Test
    public void success0() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        compare(a, RESTful.success());
    }

    @Test
    public void success1() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        compare(a, RESTful.success(state));
    }

    @Test
    public void success2() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        compare(a, RESTful.success(state, message));
    }

    @Test
    public void success3() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setData(data);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        compare(a, RESTful.success(state, message, data));
    }

    @Test
    public void success4() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.success(state, message, data, params));
    }

    @Test
    public void success5() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RESTful.success(state, data));
    }

    @Test
    public void success6() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.success(state, data, params));
    }

    @Test
    public void success7() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        compare(a, RESTful.success(message));
    }

    @Test
    public void success8() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RESTful.success(message, data));
    }

    @Test
    public void success9() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.success(message, data, params));
    }

    @Test
    public void success10() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RESTful.success(data));
    }

    @Test
    public void success11() throws Exception {
        Message a = new Message();
        a.setState(RestMessageEnum.SUCCESS.getState());
        a.setMessage(RestMessageEnum.SUCCESS.getMessage());
        a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.success(data, params));
    }

    @Test
    public void success12() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            compare(a, RESTful.success(type));
        }
    }

    @Test
    public void success13() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            compare(a, RESTful.success(type, state));
        }
    }

    @Test
    public void success14() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            compare(a, RESTful.success(type, state, message));
        }
    }

    @Test
    public void success15() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RESTful.success(type, state, message, data));
        }
    }

    @Test
    public void success16() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.success(type, state, message, data, params));
        }
    }

    @Test
    public void success17() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RESTful.success(type, state, data));
        }
    }

    @Test
    public void success18() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.success(type, state, data, params));
        }
    }

    @Test
    public void success19() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            compare(a, RESTful.success(type, message));
        }
    }

    @Test
    public void success20() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RESTful.success(type, message, data));
        }
    }

    @Test
    public void success21() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type, message));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.success(type, message, data, params));
        }
    }

    @Test
    public void success22() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RESTful.success(type, data));
        }
    }

    @Test
    public void success23() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setState(RestMessageEnum.getState(NetworkEnum.SUCCESS, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.SUCCESS, type));
            a.setSuccess(NetworkEnum.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.success(type, data, params));
        }
    }

    @Test
    public void error0() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        compare(a, RESTful.error(e));
    }

    @Test
    public void error1() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        compare(a, RESTful.error(e, state));
    }

    @Test
    public void error2() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        compare(a, RESTful.error(e, state, message));
    }

    @Test
    public void error3() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        compare(a, RESTful.error(e, state, message, data));
    }

    @Test
    public void error4() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.error(e, state, message, data, params));
    }

    @Test
    public void error5() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        compare(a, RESTful.error(e, state, data));
    }

    @Test
    public void error6() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.error(e, state, data, params));
    }

    @Test
    public void error7() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        compare(a, RESTful.error(e, message));
    }

    @Test
    public void error8() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        compare(a, RESTful.error(e, message, data));
    }

    @Test
    public void error9() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.error(e, message, data, params));
    }

    @Test
    public void error10() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        compare(a, RESTful.error(e, data));
    }

    @Test
    public void error11() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(RestMessageEnum.ERROR.getState());
        a.setMessage(RestMessageEnum.ERROR.getMessage());
        a.setSuccess(NetworkEnum.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RESTful.error(e, data, params));
    }

    @Test
    public void error12() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            compare(a, RESTful.error(type, e));
        }
    }

    @Test
    public void error13() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            compare(a, RESTful.error(type, e, state));
        }
    }

    @Test
    public void error14() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            compare(a, RESTful.error(type, e, state, message));
        }
    }

    @Test
    public void error15() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            compare(a, RESTful.error(type, e, state, message, data));
        }
    }

    @Test
    public void error16() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.error(type, e, state, message, data, params));
        }
    }

    @Test
    public void error17() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            compare(a, RESTful.error(type, e, state, data));
        }
    }

    @Test
    public void error18() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type, state));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.error(type, e, state, data, params));
        }
    }


    @Test
    public void error19() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            compare(a, RESTful.error(type, e, message));
        }
    }

    @Test
    public void error20() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            compare(a, RESTful.error(type, e, message, data));
        }
    }

    @Test
    public void error21() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type, message));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.error(type, e, message, data, params));
        }
    }

    @Test
    public void error22() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            compare(a, RESTful.error(type, e, data));
        }
    }

    @Test
    public void error23() throws Exception {
        for (RestTypeEnum type : RestTypeEnum.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(RestMessageEnum.getState(NetworkEnum.ERROR, type));
            a.setMessage(RestMessageEnum.getMessage(NetworkEnum.ERROR, type));
            a.setSuccess(NetworkEnum.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RESTful.error(type, e, data, params));
        }
    }
}
