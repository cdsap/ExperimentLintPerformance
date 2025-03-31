package com.performance.module_3_253

class Feature253UseCase1(
    private val repository: Feature253Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
