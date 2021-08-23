# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.4
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class OrderReconcileRequest(object):
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
        'account_id': 'str',
        'non_fractional': 'bool',
        'order_track_ids': 'list[str]',
        'portfolio_id': 'str',
        'tenant_id': 'str'
    }

    attribute_map = {
        'account_id': 'account_id',
        'non_fractional': 'non_fractional',
        'order_track_ids': 'order_track_ids',
        'portfolio_id': 'portfolio_id',
        'tenant_id': 'tenant_id'
    }

    def __init__(self, account_id=None, non_fractional=None, order_track_ids=None, portfolio_id=None, tenant_id=None, _configuration=None):  # noqa: E501
        """OrderReconcileRequest - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._account_id = None
        self._non_fractional = None
        self._order_track_ids = None
        self._portfolio_id = None
        self._tenant_id = None
        self.discriminator = None

        if account_id is not None:
            self.account_id = account_id
        if non_fractional is not None:
            self.non_fractional = non_fractional
        if order_track_ids is not None:
            self.order_track_ids = order_track_ids
        if portfolio_id is not None:
            self.portfolio_id = portfolio_id
        if tenant_id is not None:
            self.tenant_id = tenant_id

    @property
    def account_id(self):
        """Gets the account_id of this OrderReconcileRequest.  # noqa: E501


        :return: The account_id of this OrderReconcileRequest.  # noqa: E501
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """Sets the account_id of this OrderReconcileRequest.


        :param account_id: The account_id of this OrderReconcileRequest.  # noqa: E501
        :type: str
        """

        self._account_id = account_id

    @property
    def non_fractional(self):
        """Gets the non_fractional of this OrderReconcileRequest.  # noqa: E501


        :return: The non_fractional of this OrderReconcileRequest.  # noqa: E501
        :rtype: bool
        """
        return self._non_fractional

    @non_fractional.setter
    def non_fractional(self, non_fractional):
        """Sets the non_fractional of this OrderReconcileRequest.


        :param non_fractional: The non_fractional of this OrderReconcileRequest.  # noqa: E501
        :type: bool
        """

        self._non_fractional = non_fractional

    @property
    def order_track_ids(self):
        """Gets the order_track_ids of this OrderReconcileRequest.  # noqa: E501


        :return: The order_track_ids of this OrderReconcileRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._order_track_ids

    @order_track_ids.setter
    def order_track_ids(self, order_track_ids):
        """Sets the order_track_ids of this OrderReconcileRequest.


        :param order_track_ids: The order_track_ids of this OrderReconcileRequest.  # noqa: E501
        :type: list[str]
        """

        self._order_track_ids = order_track_ids

    @property
    def portfolio_id(self):
        """Gets the portfolio_id of this OrderReconcileRequest.  # noqa: E501


        :return: The portfolio_id of this OrderReconcileRequest.  # noqa: E501
        :rtype: str
        """
        return self._portfolio_id

    @portfolio_id.setter
    def portfolio_id(self, portfolio_id):
        """Sets the portfolio_id of this OrderReconcileRequest.


        :param portfolio_id: The portfolio_id of this OrderReconcileRequest.  # noqa: E501
        :type: str
        """

        self._portfolio_id = portfolio_id

    @property
    def tenant_id(self):
        """Gets the tenant_id of this OrderReconcileRequest.  # noqa: E501


        :return: The tenant_id of this OrderReconcileRequest.  # noqa: E501
        :rtype: str
        """
        return self._tenant_id

    @tenant_id.setter
    def tenant_id(self, tenant_id):
        """Sets the tenant_id of this OrderReconcileRequest.


        :param tenant_id: The tenant_id of this OrderReconcileRequest.  # noqa: E501
        :type: str
        """

        self._tenant_id = tenant_id

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
        if issubclass(OrderReconcileRequest, dict):
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
        if not isinstance(other, OrderReconcileRequest):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, OrderReconcileRequest):
            return True

        return self.to_dict() != other.to_dict()
