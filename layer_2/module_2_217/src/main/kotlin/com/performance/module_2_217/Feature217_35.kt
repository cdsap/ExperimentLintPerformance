package com.performance.module_2_217

class Feature217UseCase1(
    private val repository: Feature217Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
