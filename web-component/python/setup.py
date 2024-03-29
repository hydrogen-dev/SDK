# coding: utf-8

"""
    Hydrogen App Token API

    The Hydrogen App Token API  # noqa: E501

    OpenAPI spec version: 1.0.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "app_token_api"
VERSION = "1.0.2"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "certifi>=2017.4.17",
    "python-dateutil>=2.1",
    "six>=1.10",
    "urllib3>=1.23"
]
    

setup(
    name=NAME,
    version=VERSION,
    description="Hydrogen App Token API",
    author_email="info@hydrogenplatform.com",
    url="https://www.hydrogenplatform.com",
    keywords=["Swagger", "Hydrogen Nucleus API"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    The App Token API  # noqa: E501
    """
)
