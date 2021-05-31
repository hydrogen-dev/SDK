# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from integration_api.configuration import Configuration


class ResponseEntity(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'body': 'object',
        'status_code': 'str',
        'status_code_value': 'int'
    }

    attribute_map = {
        'body': 'body',
        'status_code': 'status_code',
        'status_code_value': 'status_code_value'
    }

    def __init__(self, body=None, status_code=None, status_code_value=None, _configuration=None):  # noqa: E501
        """ResponseEntity - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._body = None
        self._status_code = None
        self._status_code_value = None
        self.discriminator = None

        if body is not None:
            self.body = body
        if status_code is not None:
            self.status_code = status_code
        if status_code_value is not None:
            self.status_code_value = status_code_value

    @property
    def body(self):
        """Gets the body of this ResponseEntity.  # noqa: E501


        :return: The body of this ResponseEntity.  # noqa: E501
        :rtype: object
        """
        return self._body

    @body.setter
    def body(self, body):
        """Sets the body of this ResponseEntity.


        :param body: The body of this ResponseEntity.  # noqa: E501
        :type: object
        """

        self._body = body

    @property
    def status_code(self):
        """Gets the status_code of this ResponseEntity.  # noqa: E501


        :return: The status_code of this ResponseEntity.  # noqa: E501
        :rtype: str
        """
        return self._status_code

    @status_code.setter
    def status_code(self, status_code):
        """Sets the status_code of this ResponseEntity.


        :param status_code: The status_code of this ResponseEntity.  # noqa: E501
        :type: str
        """
        allowed_values = ["100 CONTINUE", "101 SWITCHING_PROTOCOLS", "102 PROCESSING", "103 CHECKPOINT", "200 OK", "201 CREATED", "202 ACCEPTED", "203 NON_AUTHORITATIVE_INFORMATION", "204 NO_CONTENT", "205 RESET_CONTENT", "206 PARTIAL_CONTENT", "207 MULTI_STATUS", "208 ALREADY_REPORTED", "226 IM_USED", "300 MULTIPLE_CHOICES", "301 MOVED_PERMANENTLY", "302 FOUND", "302 MOVED_TEMPORARILY", "303 SEE_OTHER", "304 NOT_MODIFIED", "305 USE_PROXY", "307 TEMPORARY_REDIRECT", "308 PERMANENT_REDIRECT", "400 BAD_REQUEST", "401 UNAUTHORIZED", "402 PAYMENT_REQUIRED", "403 FORBIDDEN", "404 NOT_FOUND", "405 METHOD_NOT_ALLOWED", "406 NOT_ACCEPTABLE", "407 PROXY_AUTHENTICATION_REQUIRED", "408 REQUEST_TIMEOUT", "409 CONFLICT", "410 GONE", "411 LENGTH_REQUIRED", "412 PRECONDITION_FAILED", "413 PAYLOAD_TOO_LARGE", "413 REQUEST_ENTITY_TOO_LARGE", "414 URI_TOO_LONG", "414 REQUEST_URI_TOO_LONG", "415 UNSUPPORTED_MEDIA_TYPE", "416 REQUESTED_RANGE_NOT_SATISFIABLE", "417 EXPECTATION_FAILED", "418 I_AM_A_TEAPOT", "419 INSUFFICIENT_SPACE_ON_RESOURCE", "420 METHOD_FAILURE", "421 DESTINATION_LOCKED", "422 UNPROCESSABLE_ENTITY", "423 LOCKED", "424 FAILED_DEPENDENCY", "426 UPGRADE_REQUIRED", "428 PRECONDITION_REQUIRED", "429 TOO_MANY_REQUESTS", "431 REQUEST_HEADER_FIELDS_TOO_LARGE", "451 UNAVAILABLE_FOR_LEGAL_REASONS", "500 INTERNAL_SERVER_ERROR", "501 NOT_IMPLEMENTED", "502 BAD_GATEWAY", "503 SERVICE_UNAVAILABLE", "504 GATEWAY_TIMEOUT", "505 HTTP_VERSION_NOT_SUPPORTED", "506 VARIANT_ALSO_NEGOTIATES", "507 INSUFFICIENT_STORAGE", "508 LOOP_DETECTED", "509 BANDWIDTH_LIMIT_EXCEEDED", "510 NOT_EXTENDED", "511 NETWORK_AUTHENTICATION_REQUIRED"]  # noqa: E501
        if (self._configuration.client_side_validation and
                status_code not in allowed_values):
            raise ValueError(
                "Invalid value for `status_code` ({0}), must be one of {1}"  # noqa: E501
                .format(status_code, allowed_values)
            )

        self._status_code = status_code

    @property
    def status_code_value(self):
        """Gets the status_code_value of this ResponseEntity.  # noqa: E501


        :return: The status_code_value of this ResponseEntity.  # noqa: E501
        :rtype: int
        """
        return self._status_code_value

    @status_code_value.setter
    def status_code_value(self, status_code_value):
        """Sets the status_code_value of this ResponseEntity.


        :param status_code_value: The status_code_value of this ResponseEntity.  # noqa: E501
        :type: int
        """

        self._status_code_value = status_code_value

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ResponseEntity, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ResponseEntity):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ResponseEntity):
            return True

        return self.to_dict() != other.to_dict()
