package com.performance.module_3_253

class Feature253UseCase2(
    private val repository: Feature253Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
