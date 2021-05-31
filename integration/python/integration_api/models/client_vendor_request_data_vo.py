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


class ClientVendorRequestDataVO(object):
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
        'addresses': 'list[Address]',
        'business_name': 'str',
        'country_of_citizenship': 'str',
        'date_of_birth': 'date',
        'email': 'str',
        'first_name': 'str',
        'gender': 'str',
        'identification_number': 'str',
        'identification_number_type': 'str',
        'identifications': 'list[Identification]',
        'last_name': 'str',
        'metadata': 'dict(str, str)',
        'middle_name': 'str',
        'phone_number': 'str',
        'politically_exposed_person': 'PoliticallyExposedPersonDTO',
        'prefix': 'str',
        'suffix': 'str',
        'title': 'str'
    }

    attribute_map = {
        'addresses': 'addresses',
        'business_name': 'business_name',
        'country_of_citizenship': 'country_of_citizenship',
        'date_of_birth': 'date_of_birth',
        'email': 'email',
        'first_name': 'first_name',
        'gender': 'gender',
        'identification_number': 'identification_number',
        'identification_number_type': 'identification_number_type',
        'identifications': 'identifications',
        'last_name': 'last_name',
        'metadata': 'metadata',
        'middle_name': 'middle_name',
        'phone_number': 'phone_number',
        'politically_exposed_person': 'politically_exposed_person',
        'prefix': 'prefix',
        'suffix': 'suffix',
        'title': 'title'
    }

    def __init__(self, addresses=None, business_name=None, country_of_citizenship=None, date_of_birth=None, email=None, first_name=None, gender=None, identification_number=None, identification_number_type=None, identifications=None, last_name=None, metadata=None, middle_name=None, phone_number=None, politically_exposed_person=None, prefix=None, suffix=None, title=None, _configuration=None):  # noqa: E501
        """ClientVendorRequestDataVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._addresses = None
        self._business_name = None
        self._country_of_citizenship = None
        self._date_of_birth = None
        self._email = None
        self._first_name = None
        self._gender = None
        self._identification_number = None
        self._identification_number_type = None
        self._identifications = None
        self._last_name = None
        self._metadata = None
        self._middle_name = None
        self._phone_number = None
        self._politically_exposed_person = None
        self._prefix = None
        self._suffix = None
        self._title = None
        self.discriminator = None

        if addresses is not None:
            self.addresses = addresses
        if business_name is not None:
            self.business_name = business_name
        if country_of_citizenship is not None:
            self.country_of_citizenship = country_of_citizenship
        if date_of_birth is not None:
            self.date_of_birth = date_of_birth
        if email is not None:
            self.email = email
        if first_name is not None:
            self.first_name = first_name
        if gender is not None:
            self.gender = gender
        if identification_number is not None:
            self.identification_number = identification_number
        if identification_number_type is not None:
            self.identification_number_type = identification_number_type
        if identifications is not None:
            self.identifications = identifications
        if last_name is not None:
            self.last_name = last_name
        if metadata is not None:
            self.metadata = metadata
        if middle_name is not None:
            self.middle_name = middle_name
        if phone_number is not None:
            self.phone_number = phone_number
        if politically_exposed_person is not None:
            self.politically_exposed_person = politically_exposed_person
        if prefix is not None:
            self.prefix = prefix
        if suffix is not None:
            self.suffix = suffix
        if title is not None:
            self.title = title

    @property
    def addresses(self):
        """Gets the addresses of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The addresses of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: list[Address]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses):
        """Sets the addresses of this ClientVendorRequestDataVO.


        :param addresses: The addresses of this ClientVendorRequestDataVO.  # noqa: E501
        :type: list[Address]
        """

        self._addresses = addresses

    @property
    def business_name(self):
        """Gets the business_name of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The business_name of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._business_name

    @business_name.setter
    def business_name(self, business_name):
        """Sets the business_name of this ClientVendorRequestDataVO.


        :param business_name: The business_name of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._business_name = business_name

    @property
    def country_of_citizenship(self):
        """Gets the country_of_citizenship of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The country_of_citizenship of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._country_of_citizenship

    @country_of_citizenship.setter
    def country_of_citizenship(self, country_of_citizenship):
        """Sets the country_of_citizenship of this ClientVendorRequestDataVO.


        :param country_of_citizenship: The country_of_citizenship of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._country_of_citizenship = country_of_citizenship

    @property
    def date_of_birth(self):
        """Gets the date_of_birth of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The date_of_birth of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: date
        """
        return self._date_of_birth

    @date_of_birth.setter
    def date_of_birth(self, date_of_birth):
        """Sets the date_of_birth of this ClientVendorRequestDataVO.


        :param date_of_birth: The date_of_birth of this ClientVendorRequestDataVO.  # noqa: E501
        :type: date
        """

        self._date_of_birth = date_of_birth

    @property
    def email(self):
        """Gets the email of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The email of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """Sets the email of this ClientVendorRequestDataVO.


        :param email: The email of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._email = email

    @property
    def first_name(self):
        """Gets the first_name of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The first_name of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name):
        """Sets the first_name of this ClientVendorRequestDataVO.


        :param first_name: The first_name of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._first_name = first_name

    @property
    def gender(self):
        """Gets the gender of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The gender of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._gender

    @gender.setter
    def gender(self, gender):
        """Sets the gender of this ClientVendorRequestDataVO.


        :param gender: The gender of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._gender = gender

    @property
    def identification_number(self):
        """Gets the identification_number of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The identification_number of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._identification_number

    @identification_number.setter
    def identification_number(self, identification_number):
        """Sets the identification_number of this ClientVendorRequestDataVO.


        :param identification_number: The identification_number of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._identification_number = identification_number

    @property
    def identification_number_type(self):
        """Gets the identification_number_type of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The identification_number_type of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._identification_number_type

    @identification_number_type.setter
    def identification_number_type(self, identification_number_type):
        """Sets the identification_number_type of this ClientVendorRequestDataVO.


        :param identification_number_type: The identification_number_type of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._identification_number_type = identification_number_type

    @property
    def identifications(self):
        """Gets the identifications of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The identifications of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: list[Identification]
        """
        return self._identifications

    @identifications.setter
    def identifications(self, identifications):
        """Sets the identifications of this ClientVendorRequestDataVO.


        :param identifications: The identifications of this ClientVendorRequestDataVO.  # noqa: E501
        :type: list[Identification]
        """

        self._identifications = identifications

    @property
    def last_name(self):
        """Gets the last_name of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The last_name of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name):
        """Sets the last_name of this ClientVendorRequestDataVO.


        :param last_name: The last_name of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._last_name = last_name

    @property
    def metadata(self):
        """Gets the metadata of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The metadata of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: dict(str, str)
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """Sets the metadata of this ClientVendorRequestDataVO.


        :param metadata: The metadata of this ClientVendorRequestDataVO.  # noqa: E501
        :type: dict(str, str)
        """

        self._metadata = metadata

    @property
    def middle_name(self):
        """Gets the middle_name of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The middle_name of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._middle_name

    @middle_name.setter
    def middle_name(self, middle_name):
        """Sets the middle_name of this ClientVendorRequestDataVO.


        :param middle_name: The middle_name of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._middle_name = middle_name

    @property
    def phone_number(self):
        """Gets the phone_number of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The phone_number of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._phone_number

    @phone_number.setter
    def phone_number(self, phone_number):
        """Sets the phone_number of this ClientVendorRequestDataVO.


        :param phone_number: The phone_number of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._phone_number = phone_number

    @property
    def politically_exposed_person(self):
        """Gets the politically_exposed_person of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The politically_exposed_person of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: PoliticallyExposedPersonDTO
        """
        return self._politically_exposed_person

    @politically_exposed_person.setter
    def politically_exposed_person(self, politically_exposed_person):
        """Sets the politically_exposed_person of this ClientVendorRequestDataVO.


        :param politically_exposed_person: The politically_exposed_person of this ClientVendorRequestDataVO.  # noqa: E501
        :type: PoliticallyExposedPersonDTO
        """

        self._politically_exposed_person = politically_exposed_person

    @property
    def prefix(self):
        """Gets the prefix of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The prefix of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._prefix

    @prefix.setter
    def prefix(self, prefix):
        """Sets the prefix of this ClientVendorRequestDataVO.


        :param prefix: The prefix of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._prefix = prefix

    @property
    def suffix(self):
        """Gets the suffix of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The suffix of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._suffix

    @suffix.setter
    def suffix(self, suffix):
        """Sets the suffix of this ClientVendorRequestDataVO.


        :param suffix: The suffix of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._suffix = suffix

    @property
    def title(self):
        """Gets the title of this ClientVendorRequestDataVO.  # noqa: E501


        :return: The title of this ClientVendorRequestDataVO.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this ClientVendorRequestDataVO.


        :param title: The title of this ClientVendorRequestDataVO.  # noqa: E501
        :type: str
        """

        self._title = title

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
        if issubclass(ClientVendorRequestDataVO, dict):
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
        if not isinstance(other, ClientVendorRequestDataVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ClientVendorRequestDataVO):
            return True

        return self.to_dict() != other.to_dict()
