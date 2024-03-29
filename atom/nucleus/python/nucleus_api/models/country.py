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


class Country(object):
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
        'alpha2_code': 'str',
        'alpha3_code': 'str',
        'country': 'str',
        'latitude': 'float',
        'longitude': 'float',
        'numeric_code': 'int'
    }

    attribute_map = {
        'alpha2_code': 'alpha2_code',
        'alpha3_code': 'alpha3_code',
        'country': 'country',
        'latitude': 'latitude',
        'longitude': 'longitude',
        'numeric_code': 'numeric_code'
    }

    def __init__(self, alpha2_code=None, alpha3_code=None, country=None, latitude=None, longitude=None, numeric_code=None, _configuration=None):  # noqa: E501
        """Country - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._alpha2_code = None
        self._alpha3_code = None
        self._country = None
        self._latitude = None
        self._longitude = None
        self._numeric_code = None
        self.discriminator = None

        self.alpha2_code = alpha2_code
        if alpha3_code is not None:
            self.alpha3_code = alpha3_code
        self.country = country
        if latitude is not None:
            self.latitude = latitude
        if longitude is not None:
            self.longitude = longitude
        self.numeric_code = numeric_code

    @property
    def alpha2_code(self):
        """Gets the alpha2_code of this Country.  # noqa: E501

        alpha_2_code  # noqa: E501

        :return: The alpha2_code of this Country.  # noqa: E501
        :rtype: str
        """
        return self._alpha2_code

    @alpha2_code.setter
    def alpha2_code(self, alpha2_code):
        """Sets the alpha2_code of this Country.

        alpha_2_code  # noqa: E501

        :param alpha2_code: The alpha2_code of this Country.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and alpha2_code is None:
            raise ValueError("Invalid value for `alpha2_code`, must not be `None`")  # noqa: E501

        self._alpha2_code = alpha2_code

    @property
    def alpha3_code(self):
        """Gets the alpha3_code of this Country.  # noqa: E501

        alpha_3_code  # noqa: E501

        :return: The alpha3_code of this Country.  # noqa: E501
        :rtype: str
        """
        return self._alpha3_code

    @alpha3_code.setter
    def alpha3_code(self, alpha3_code):
        """Sets the alpha3_code of this Country.

        alpha_3_code  # noqa: E501

        :param alpha3_code: The alpha3_code of this Country.  # noqa: E501
        :type: str
        """

        self._alpha3_code = alpha3_code

    @property
    def country(self):
        """Gets the country of this Country.  # noqa: E501

        country  # noqa: E501

        :return: The country of this Country.  # noqa: E501
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country):
        """Sets the country of this Country.

        country  # noqa: E501

        :param country: The country of this Country.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and country is None:
            raise ValueError("Invalid value for `country`, must not be `None`")  # noqa: E501

        self._country = country

    @property
    def latitude(self):
        """Gets the latitude of this Country.  # noqa: E501

        latitude  # noqa: E501

        :return: The latitude of this Country.  # noqa: E501
        :rtype: float
        """
        return self._latitude

    @latitude.setter
    def latitude(self, latitude):
        """Sets the latitude of this Country.

        latitude  # noqa: E501

        :param latitude: The latitude of this Country.  # noqa: E501
        :type: float
        """

        self._latitude = latitude

    @property
    def longitude(self):
        """Gets the longitude of this Country.  # noqa: E501

        longitude  # noqa: E501

        :return: The longitude of this Country.  # noqa: E501
        :rtype: float
        """
        return self._longitude

    @longitude.setter
    def longitude(self, longitude):
        """Sets the longitude of this Country.

        longitude  # noqa: E501

        :param longitude: The longitude of this Country.  # noqa: E501
        :type: float
        """

        self._longitude = longitude

    @property
    def numeric_code(self):
        """Gets the numeric_code of this Country.  # noqa: E501

        numericCode  # noqa: E501

        :return: The numeric_code of this Country.  # noqa: E501
        :rtype: int
        """
        return self._numeric_code

    @numeric_code.setter
    def numeric_code(self, numeric_code):
        """Sets the numeric_code of this Country.

        numericCode  # noqa: E501

        :param numeric_code: The numeric_code of this Country.  # noqa: E501
        :type: int
        """
        if self._configuration.client_side_validation and numeric_code is None:
            raise ValueError("Invalid value for `numeric_code`, must not be `None`")  # noqa: E501

        self._numeric_code = numeric_code

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
        if issubclass(Country, dict):
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
        if not isinstance(other, Country):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Country):
            return True

        return self.to_dict() != other.to_dict()
