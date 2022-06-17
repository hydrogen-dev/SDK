# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class BusinessDetailsVO(object):
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
        'address': 'list[BusinessAddress]',
        'business_id': 'str',
        'dba_name': 'str',
        'email': 'str',
        'legal_name': 'str',
        'website': 'str'
    }

    attribute_map = {
        'address': 'address',
        'business_id': 'business_id',
        'dba_name': 'dba_name',
        'email': 'email',
        'legal_name': 'legal_name',
        'website': 'website'
    }

    def __init__(self, address=None, business_id=None, dba_name=None, email=None, legal_name=None, website=None, _configuration=None):  # noqa: E501
        """BusinessDetailsVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._address = None
        self._business_id = None
        self._dba_name = None
        self._email = None
        self._legal_name = None
        self._website = None
        self.discriminator = None

        if address is not None:
            self.address = address
        if business_id is not None:
            self.business_id = business_id
        if dba_name is not None:
            self.dba_name = dba_name
        if email is not None:
            self.email = email
        if legal_name is not None:
            self.legal_name = legal_name
        if website is not None:
            self.website = website

    @property
    def address(self):
        """Gets the address of this BusinessDetailsVO.  # noqa: E501

        address  # noqa: E501

        :return: The address of this BusinessDetailsVO.  # noqa: E501
        :rtype: list[BusinessAddress]
        """
        return self._address

    @address.setter
    def address(self, address):
        """Sets the address of this BusinessDetailsVO.

        address  # noqa: E501

        :param address: The address of this BusinessDetailsVO.  # noqa: E501
        :type: list[BusinessAddress]
        """

        self._address = address

    @property
    def business_id(self):
        """Gets the business_id of this BusinessDetailsVO.  # noqa: E501

        businessId  # noqa: E501

        :return: The business_id of this BusinessDetailsVO.  # noqa: E501
        :rtype: str
        """
        return self._business_id

    @business_id.setter
    def business_id(self, business_id):
        """Sets the business_id of this BusinessDetailsVO.

        businessId  # noqa: E501

        :param business_id: The business_id of this BusinessDetailsVO.  # noqa: E501
        :type: str
        """

        self._business_id = business_id

    @property
    def dba_name(self):
        """Gets the dba_name of this BusinessDetailsVO.  # noqa: E501

        dbaName  # noqa: E501

        :return: The dba_name of this BusinessDetailsVO.  # noqa: E501
        :rtype: str
        """
        return self._dba_name

    @dba_name.setter
    def dba_name(self, dba_name):
        """Sets the dba_name of this BusinessDetailsVO.

        dbaName  # noqa: E501

        :param dba_name: The dba_name of this BusinessDetailsVO.  # noqa: E501
        :type: str
        """

        self._dba_name = dba_name

    @property
    def email(self):
        """Gets the email of this BusinessDetailsVO.  # noqa: E501

        email  # noqa: E501

        :return: The email of this BusinessDetailsVO.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this BusinessDetailsVO.

        email  # noqa: E501

        :param email: The email of this BusinessDetailsVO.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def legal_name(self):
        """Gets the legal_name of this BusinessDetailsVO.  # noqa: E501

        legalName  # noqa: E501

        :return: The legal_name of this BusinessDetailsVO.  # noqa: E501
        :rtype: str
        """
        return self._legal_name

    @legal_name.setter
    def legal_name(self, legal_name):
        """Sets the legal_name of this BusinessDetailsVO.

        legalName  # noqa: E501

        :param legal_name: The legal_name of this BusinessDetailsVO.  # noqa: E501
        :type: str
        """

        self._legal_name = legal_name

    @property
    def website(self):
        """Gets the website of this BusinessDetailsVO.  # noqa: E501

        website  # noqa: E501

        :return: The website of this BusinessDetailsVO.  # noqa: E501
        :rtype: str
        """
        return self._website

    @website.setter
    def website(self, website):
        """Sets the website of this BusinessDetailsVO.

        website  # noqa: E501

        :param website: The website of this BusinessDetailsVO.  # noqa: E501
        :type: str
        """

        self._website = website

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
        if issubclass(BusinessDetailsVO, dict):
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
        if not isinstance(other, BusinessDetailsVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, BusinessDetailsVO):
            return True

        return self.to_dict() != other.to_dict()
