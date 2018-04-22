package org.hyl.bucket.web.commons.rest;

import org.assertj.core.api.Assertions;
import org.hyl.bucket.commons.result.domain.Message;
import org.hyl.bucket.web.commons.rest.enums.Result;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class RestUtilTest {
    private Integer state;

    private String message;

    private List<Integer> data;

    private String e;

    private Map<String, Integer> params;

    @Before
    public void setUp() throws Exception {
        this.state = new Random().nextInt(400) + 100;
        this.message = "TEST";
        this.data = new ArrayList<>();
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.data.add(new Random().nextInt());
        this.e = new RuntimeException("ERROR").getMessage();
        this.params = new HashMap<>();
        this.params.put("id", new Random().nextInt(100));
    }

    @Test
    public void success0() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(org.hyl.bucket.commons.result.enums.Result.Network.SUCCESS.isSuccess());
        compare(a, RestUtil.success());
    }

    @Test
    public void success1() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, RestUtil.success(state));
    }

    @Test
    public void success2() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, RestUtil.success(state, message));
    }

    @Test
    public void success3() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setData(data);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, RestUtil.success(state, message, data));
    }

    @Test
    public void success4() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.success(state, message, data, params));
    }

    @Test
    public void success5() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RestUtil.success(state, data));
    }

    @Test
    public void success6() throws Exception {
        Message a = new Message();
        a.setState(state);
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.success(state, data, params));
    }

    @Test
    public void success7() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        compare(a, RestUtil.success(message));
    }

    @Test
    public void success8() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RestUtil.success(message, data));
    }

    @Test
    public void success9() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.success(message, data, params));
    }

    @Test
    public void success10() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        compare(a, RestUtil.success(data));
    }

    @Test
    public void success11() throws Exception {
        Message a = new Message();
        a.setState(Result.SUCCESS.getState());
        a.setMessage(Result.SUCCESS.getMessage());
        a.setSuccess(Result.Network.SUCCESS.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.success(data, params));
    }

    @Test
    public void success12() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            compare(a, RestUtil.success(type));
        }
    }

    @Test
    public void success13() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            compare(a, RestUtil.success(type, state));
        }
    }

    @Test
    public void success14() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            compare(a, RestUtil.success(type, state, message));
        }
    }

    @Test
    public void success15() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RestUtil.success(type, state, message, data));
        }
    }

    @Test
    public void success16() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.success(type, state, message, data, params));
        }
    }

    @Test
    public void success17() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RestUtil.success(type, state, data));
        }
    }

    @Test
    public void success18() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS, state));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.success(type, state, data, params));
        }
    }

    @Test
    public void success19() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            compare(a, RestUtil.success(type, message));
        }
    }

    @Test
    public void success20() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RestUtil.success(type, message, data));
        }
    }

    @Test
    public void success21() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS, message));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.success(type, message, data, params));
        }
    }

    @Test
    public void success22() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            compare(a, RestUtil.success(type, data));
        }
    }

    @Test
    public void success23() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setState(type.getState(Result.Network.SUCCESS));
            a.setMessage(type.getMessage(Result.Network.SUCCESS));
            a.setSuccess(Result.Network.SUCCESS.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.success(type, data, params));
        }
    }

    @Test
    public void error0() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, RestUtil.error(e));
    }

    @Test
    public void error1() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, RestUtil.error(e, state));
    }

    @Test
    public void error2() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, RestUtil.error(e, state, message));
    }

    @Test
    public void error3() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, RestUtil.error(e, state, message, data));
    }

    @Test
    public void error4() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.error(e, state, message, data, params));
    }

    @Test
    public void error5() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, RestUtil.error(e, state, data));
    }

    @Test
    public void error6() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(state);
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.error(e, state, data, params));
    }

    @Test
    public void error7() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        compare(a, RestUtil.error(e, message));
    }

    @Test
    public void error8() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, RestUtil.error(e, message, data));
    }

    @Test
    public void error9() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(message);
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.error(e, message, data, params));
    }

    @Test
    public void error10() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        compare(a, RestUtil.error(e, data));
    }

    @Test
    public void error11() throws Exception {
        Message a = new Message();
        a.setE(e);
        a.setState(Result.ERROR.getState());
        a.setMessage(Result.ERROR.getMessage());
        a.setSuccess(Result.Network.ERROR.isSuccess());
        a.setData(data);
        a.setParams(params);
        compare(a, RestUtil.error(e, data, params));
    }

    @Test
    public void error12() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            compare(a, RestUtil.error(type, e));
        }
    }

    @Test
    public void error13() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            compare(a, RestUtil.error(type, e, state));
        }
    }

    @Test
    public void error14() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            compare(a, RestUtil.error(type, e, state, message));
        }
    }

    @Test
    public void error15() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            compare(a, RestUtil.error(type, e, state, message, data));
        }
    }

    @Test
    public void error16() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.error(type, e, state, message, data, params));
        }
    }

    @Test
    public void error17() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            compare(a, RestUtil.error(type, e, state, data));
        }
    }

    @Test
    public void error18() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR, state));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.error(type, e, state, data, params));
        }
    }


    @Test
    public void error19() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            compare(a, RestUtil.error(type, e, message));
        }
    }

    @Test
    public void error20() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            compare(a, RestUtil.error(type, e, message, data));
        }
    }

    @Test
    public void error21() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR, message));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.error(type, e, message, data, params));
        }
    }

    @Test
    public void error22() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            compare(a, RestUtil.error(type, e, data));
        }
    }

    @Test
    public void error23() throws Exception {
        for (Result.Type type : Result.Type.values()) {
            Message a = new Message();
            a.setE(e);
            a.setState(type.getState(Result.Network.ERROR));
            a.setMessage(type.getMessage(Result.Network.ERROR));
            a.setSuccess(Result.Network.ERROR.isSuccess());
            a.setData(data);
            a.setParams(params);
            compare(a, RestUtil.error(type, e, data, params));
        }
    }

    private void compare(Message a, Message b) throws Exception {
        Assertions.assertThat(a.getState()).isEqualTo(b.getState());
        Assertions.assertThat(a.getMessage()).isEqualTo(b.getMessage());
        Assertions.assertThat(a.getData()).isEqualTo(b.getData());
        Assertions.assertThat(a.getSuccess()).isEqualTo(b.getSuccess());
        Assertions.assertThat(a.getE()).isEqualTo(b.getE());
        Assertions.assertThat(a.getParams()).isEqualTo(b.getParams());
    }
}
